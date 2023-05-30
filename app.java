<<<<<<< HEAD
#!/bin/bash
#This script is only for sudoers
#If you are not a sudoers please don't use this script
        echo "Enter your name"
        read name
        sudo cat /etc/sudoers.d/$name >> log.txt 2>&1

        if [ $? != 0 ]
        then
#if you are not a sudoer the script will stop here and the error/outout will be redirected to a file called log 
#if of the last command "$?" will be between 1 and 127 (error code) > access denied. 
#But if you are a sudoer $? will be equal to 0 (correct code) > access granted.
        echo "You are not allowed to run this script"
        else
        echo "You are about creating a new user"
        echo "enter the new user's name"
        read name
        sudo adduser $name
        echo "do you want to grant him sudo rights? Y/N"
        read a
#Here is the condition that enables the initator to grant sudo access to the new user.
        if [ $a == Y ]
        then
        sudo echo "$name ALL=(ALL) NOPASSWD:ALL" | sudo tee /etc/sudoers.d/$name
        echo "$name has been granted sudo access"
        else
        echo "$name does not need sudo right"
        fi
        echo "This is a good deployment you made here"
        fi
#Useless branch
this is a perfect script
=======
ajustment
>>>>>>> Dev
