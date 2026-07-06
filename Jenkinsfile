pipeline {

    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/kasundra-bansi/SimpleInterestCalculator.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac SimpleInterestCalculator.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java SimpleInterestCalculator'
            }
        }

    }

}