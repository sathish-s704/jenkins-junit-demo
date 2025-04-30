pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'JDK 11'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sathish-s704/jenkins-junit-ci.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
