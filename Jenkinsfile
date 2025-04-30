pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'   // Make sure this matches the Maven name in Jenkins Global Tool Configuration
    }

    stages {
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
