pipeline {

    agent any

    stages {

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }


        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }


        stage('Package') {
            steps {
                sh 'mvn package'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

    }


    post {

        success {
            echo 'Build and Test Successful'
        }

        failure {
            echo 'Build Failed'
        }

    }
}
