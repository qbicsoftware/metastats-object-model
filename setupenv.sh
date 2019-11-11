curl -s get.sdkman.io | bash
export SDKMAN_DIR="$HOME/.sdkman" && source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install groovy
groovy Validate.groovy