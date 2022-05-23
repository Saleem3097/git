
pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('testing') {
            steps {
                bat 'mvn test'
            }
        }
        stage('build') {
            steps {
                bat 'mvn package'
            }
        }
       
    }
}
