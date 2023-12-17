pipeline{
    
    agent any 
    
    stages {

        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('git  Checkout'){
            
            steps{

                
                script{
                    
                    // checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: '63e968c0-d640-4c41-afab-ec998cd04230', depthOption: 'infinity', ignoreExternalsOption: true, local: 'caryak', remote: 'https://qasvn.qassure.com/svn/CarYak/branches/CIT']], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
                    }
            }
        }

         stage('buld'){
            
            steps{
                
                script{
                    
                    sh 'cd /var/lib/jenkins/workspace/;  sh build.sh'
                    
                }
            }
        }

    }

}