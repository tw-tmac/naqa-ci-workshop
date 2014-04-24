#/bin/bash
mkdir /opt/svn/
svnadmin create /opt/svn/starfleet_repo
cp -f svn_conf/* /opt/svn/starfleet_repo/conf
