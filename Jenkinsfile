pipeline {
    agent any

    stages {
        stage('compile') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('test') {
            steps {
                echo 'tested'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy'
            }
        }
    }
}
