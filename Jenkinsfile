node
{
stage('SCM checkout')
{
git 'https://github.com/javapiyandroid/JavaCode_core_adv/'
}
tools {
        maven 'Maven 3.2.5'
    }
stage('Compile-Package'){
def mvn_version = 'M3'
  withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  sh "mvn clean package"
}
} 
}

