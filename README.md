Exp7
-------------------------------------------------
sudo apt-get install vsftpd
sudo adduser shubham
sudo gedit /etc/vsftpd.conf
{
    edit local_enable
         anonymous_enable
}
service vsftpd restart
ifconfig 
{
    copy the inet
}
ftp --inet--

Exp8
--------------------------------------------------------
sudo apt-get install xinetd telnetd
sudo gedit
{
    Edit /etc/inetd.conf

    telnet stream tcp nowait telnetd /usr/sbin/tcpd /usr/sbin/in telnetd
}
{
    Edit /etc/xinetd.conf
    {
        instances = 60
        log_type = SYSLOG authpriv
        log_on_success = HOST PID
        log_on_failure = HOST
        cps = 25 30
    }
}
sudo /etc/init.d/xinetd restart
[Note Down ip address of host]
telnet --ipaddr-- 

Exp6
----------------------------------------------------------------
java filename

Exp5
----------------------------------------------------------------
ifconfig
sudo ifconfig enp0s3:1 10.16.0.1 netmask 255.255.255.0
netstat -rn
sudo route add -net 10.16.0.0 gw 10.16.0.1 netmask 255.255.255.0 dev enp0s3
sudo route del -net 10.16.0.0 gw 10.16.0.1 netmask 255.255.255.0 dev enp0s3
sudo apt-get install iptables
sudo iptables -L
ping --inet--

Exp4
---------------------------------------------------------------------
ip addr
nmap -sn --inet--
nmap -v






