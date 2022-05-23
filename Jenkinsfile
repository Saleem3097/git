
pipeline {
    agent any
 
    stages {
        stage('compile') {
            steps {
                bat "mvn clean package"
            }
        }
        stage('testing') {
            steps {
                echo "hi"
            }
        }
        stage('build') {
            steps {
                echo "bye"
            }
        }
       
    }
}
