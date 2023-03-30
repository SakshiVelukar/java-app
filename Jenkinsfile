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
           git branch: 'main', credentialsId: '89f6fbfd-1593-443c-ba57-1e8a217fc715', url: 'git@github.com:SakshiVelukar/simple-java.git'
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
