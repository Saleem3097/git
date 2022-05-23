
pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
                bat "mvn compile"
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
