naqa-ci-workshop
================
Steps to set up your machine

1) Download virtualbox (https://www.virtualbox.org)
2) Download vagrant (http://www.vagrantup.com/downloads.html)
3) Install ansible
    -> For Mac users: brew install ansible
    -> For Windows users: 
        1) Install python 3.4
        2) Install pip (Python installer package): http://www.pip-installer.org/en/latest/installing.html
        3) run pip install ansible

Once ansible is installed, run the following command to provision the vagrant box: ansible-playbook -vvv -i inventory --user vagrant --private-key=~/.vagrant.d/insecure_private_key provision_server.yml
