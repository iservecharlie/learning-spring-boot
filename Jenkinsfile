pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                mvn clean install -DskipTests
            }
        }
        stage('Test') {
            steps {
               mvn test
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
