pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\Program Files\Java\jdk-21' 
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Prashu007ff/prashu.git'
            }
        }

        stage('Compile Java') {
            steps {
                bat 'javac prashu/SimpleOTPVerification.java'
            }
        }

        stage('Run Java Program') {
            steps {
                bat 'java -cp . prashu.SimpleOTPVerification'
            }
        }
    }
}