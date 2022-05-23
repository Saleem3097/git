pipeline {
    agent any
      tools {
          maven 'maven'
          jdk 'java'
      }
      environment {
          PATH = 'C://WINDOWS/System32'
          EMAIL_TO = 'md.saleem3097@gmail.com'
          MY_FILE = fileExists 'git'
      }
     
    stages {
        stage('clone repo') {
            when { expression { MY_FILE == 'false' } }
            steps {
             bat"""
             git clone https://github.com/Saleem3097/git.git"
             print "pulled the code"
             """
            }
        }
        stage('Compile') {
            steps {
                bat """
                cd git
                mvn compile
                """
            }
        }
        stage('Test') {
            steps {
               bat"""
               cd git
               mvn test
               """
            }
        }
        stage('Package') {
            steps {
               bat"""
               cd git
               mvn package
               """
            }
          }
  }
}
