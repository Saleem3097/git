pipeline {
    agent any
      tools {
          maven 'maven'
          jdk 'java'
      }
      environment {
          PATH = 'C://WINDOWS/System32'
      }
    stages {
        stage('git') {
            steps {
            git 'https://github.com/Saleem3097/git.git'
            }
        }
        stage ('build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
    
}
