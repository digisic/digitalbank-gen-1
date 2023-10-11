pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3" 
    }

    stages {
        
        stage('Checkout') {
            steps {
                sh 'pwd;ls -lrt'
                sh 'rm -rf digitalbank-gen-one'
                // git 'https://github.com/connectall-demo/digitalbank-gen-one.git'
                checkout scm
                sh 'pwd;ls -lrt'
                sh 'chmod -R 777 .'
            }
        }
        
        stage('Clean') {
            steps {
                echo 'Hello World'
                sh "mvn clean:clean -f bank/pom.xml"
            }
        }
        stage('Build') {
            steps {
                echo 'Build'
               // sh "mvn -Dmaven.test.failure.ignore=true clean package -f digitalbank-gen-one/bank/pom.xml"
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
               // sh "mvn test -f digitalbank-gen-one/bank/pom.xml"
            }
        }
        stage('Package') {
            steps {
                echo 'Package'
            }
        }
        stage('Publish') {
            steps {
                echo 'Publish'
            }
        }
        stage('Post Results') {
            steps {
                sh 'source ./scripts/setup.sh'
                sh 'env'
                sh './scripts/postresults.sh'
                
            }
        }
    }
}
