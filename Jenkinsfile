pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Stark734/java-maven-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

    }
}
