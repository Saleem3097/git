
pipeline {
    agent any
    tools {
        maven 'maven'
    }
    environment {
        PATH = 'C://WINDOWS/System32'
    stages {
        stage('build') {
            steps {
                bat "mvn clean package"
            }
        }
        
       }
}
