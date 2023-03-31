pipeline {
  agent {
    kubernetes {
        defaultContainer 'jenkins-slave'
        yaml '''
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.6.3-jdk-8
    imagePullPolicy: Always
'''
   }
  }
   
   stages {

    stage('Cloning Repository') {
      steps {
        container('maven') {
           git branch: 'main', credentialsId: '099a195e-63e0-47db-b4c2-1e7e4faf8314', url: 'git@github.com:SakshiVelukar/java-app.git'
       }
     }
    }

    stage('Installing dependency') {
      steps {
        container('maven') {
           sh 'mvn clean install'
         }
      }
   }
}
}
