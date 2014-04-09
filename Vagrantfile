VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
    config.vm.box = "MichaelsDesktop"
    config.vm.box_url = "https://dl.dropboxusercontent.com/u/32433098/MichaelsDesktop.box"
    #config.vm.box_url = "/Users/thoughtworker/Documents/MichaelsDesktop_with_sudo_wget_java.box"

    config.vm.host_name = "localhost"
    config.vm.provider "virtualbox" do |v|
        v.customize ["modifyvm", :id, "--memory", "2048", "--cpus", "1", "--name", "MichaelsDesktop"]
    end

    config.vm.network :private_network, ip: "10.10.10.50"
end
