VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
    config.vm.box = "StarfleetCommandServer"
    config.vm.box_url = "http://files.vagrantup.com/precise64.box"

    config.vm.host_name = "localhost"
    config.vm.provider "virtualbox" do |v|
        v.customize ["modifyvm", :id, "--memory", "2048", "--cpus", "1", "--name", "StarfleetCommandServer"]
    end

    config.vm.network :private_network, ip: "10.10.10.50"
end
