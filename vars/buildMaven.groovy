def call(String imageName) {
    sh """
       echo "docker build ${imagename}"
    """
}