pipeline {
    agent any 
    stages {
        stage('SCM Checkout'){
            steps {
            git credentialsId: 'githubCredentials', url: 'https://github.com/milanviradia/DevopsCalculator'
            }
        }
        
        stage('Clean and Compile') { 
            steps {
                sh "mvn clean"
                sh "mvn compile"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test"
            }
        }
        stage('Package in JAR') { 
            steps {
                sh "mvn package"
            }
        }
        stage('Build Image') {
      		steps {
        		script {
          			dockerImage = docker.build "milanviradia/devops_calculator" + ":latest"
        		}
      		}
    	}
    	stage('Push Image') {
      		steps {
        		script {
          			docker.withRegistry( '', 'dockerhubCredentials' ) {
            			dockerImage.push()
          			}
        		}
      		}
    	}
    	stage('Trigger Rundeck'){
    		steps {
    			build 'calculator_job'
    		}
        }
    }
}
