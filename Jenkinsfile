pipeline {
    agent any
    triggers {
        githubPush()
    }
    tools {
        maven 'Maven 3.9.6' // Match the name in Jenkins > Tools
    }
    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/cucumber-reports',
                reportFiles: 'cucumber.html',
                reportName: 'Cucumber Playwright Report'
            ]
        }
    }
}