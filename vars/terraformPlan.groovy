def call() {
    sh "which terraform"
    sh "terraform version"
    sh "terraform plan"
}