node
{
stage('SCM checkout')
{
git 'https://github.com/javapiyandroid/JavaCode_core_adv/'
}

stage('Compile-Package'){
def mvnHome= tool name: '', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
} 

}

