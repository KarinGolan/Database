
# Cookbook Name:: kk-
# Recipe:: default
#
# Copyright (C) 2017 
#
    
# Cookbook Name:: kk-
# Recipe:: default
#
# Copyright (C) 2017 
#
s3_file "/home/ec2-user/Database.jar" do
        remote_path "Database.jar"
        bucket "databasebucket1"
        s3_url "https://s3-eu-west-1.amazonaws.com/databasebucket1"
        action :create
    end


execute "running Database.jar" do
  command "java -jar /home/ec2-user/Database.jar "
  cwd "/home/ec2-user"
  action "run"
end