
pipeline {
    agent any
    environment {
       env.PATH = env.PATH + ";c:\\Windows\\System32"
   }
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
