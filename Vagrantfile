VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
    config.vm.box = "CI Server"
    config.vm.box_url = "https://github.com/2creatives/vagrant-centos/releases/download/v0.1.0/centos64-x86_64-20131030.box"

    config.vm.host_name = "localhost"
    config.vm.provider "virtualbox" do |v|
        v.customize ["modifyvm", :id, "--memory", "2048", "--cpus", "1", "--name", "CI Server"]
    end

    config.vm.network :private_network, ip: "10.10.10.5"
end
