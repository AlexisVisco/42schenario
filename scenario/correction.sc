#
# FORK AND EXCVE PART
#
nm -u 42sh
./42sh
>> wait 500
foo
/bin/ls
/bin/ls -laf
/bin/ls -l -a -F

#
# BUILTINS PART
#
exit
>> wait 1500
valgrind --leak-check=full --show-leak-kinds=all --log-file="valgrind.out" ./42sh
>> wait 1500
echo It works
cd /tmp
/bin/pwd
cd -
/bin/pwd
cd src
/bin/pwd
cd ..
cd
/bin/pwd
cd -

#
# ENV
#
env
setenv FOO=bar
env | grep FOO
/usr/bin/env | grep FOO
unsetenv FOO

env
env | grep FOO
unsetenv FOO
env
/usr/bin/env

#
# GESTION LIGNE COMMAND
#
    %
>> keys ENTER
         %
>> keys ENTER
;;; || ''
::
hjcbwshoifuveybe8f32r76t362u7edjkssd
f fu 2g
       ls
'ls'
"ls"
"l"s

#
# PIPE
#
ls | cat -e
ls | sort | cat -e
base64 /dev/urandom | head -c 1000 | grep 42 | wc -l | sed -e 's/1/Yes/g' -e 's/0/No/g'
base64 /dev/urandom | head -c 1000 | grep 42 | wc -l | sed -e 's/1/Yes/g' -e 's/0/No/g'
base64 /dev/urandom | head -c 1000 | grep 42 | wc -l | sed -e 's/1/Yes/g' -e 's/0/No/g'

#
# REDIRECTION
#
echo "Testing redirections," > /tmp/test.txt
cat /tmp/test.txt
echo "with multiple lines" >> /tmp/test.txt
cat /tmp/test.txt
wc -c < /tmp/test.txt

#
# LOGICAL OPERATORS
#
ls -l && ls
ls something || ls
ls || ls something

#
# SEPARATOR
#
ls -1; touch test_file; ls -1
rm test_file

#
# BIG TESTS
#
mkdir test ; cd test ; ls -a ; ls | cat | wc -c > fifi ; cat fifi
cd .. && rm -rf test

#
# HEREDOC
#
cd /tmp; sort << EOF | cat -e > sorted_poem ; sed -e 's/Roses/Turnips/' < sorted_poem > better_poem; cd -; echo "I prefer turnips anyway" >> /tmp/better_poem; cat /tmp/better_poem
Roses are red
Violets are blue
All my base are belong to you
I love you
EOF

#
# Inhibiteurs
#
echo "
hello world"
echo '
hello planet'
ls \
&& echo "hello 42sh"

#
# AGREGATOR
#
rm nosuchfile 2>&-
rm nosuchfile 2>&1 | cat -e
echo "No dollar character" 1>&2 | cat -e

#
# LINE EDITING
#
>> setDelay 35
hello world%
>> repeat 5 LEFT
 and after 'hello' this is %
>> repeat 5 RIGHT
>> keys CTRL,a
>> wait 1000
>> keys CTRL,e
>> keys CTRL,u
>> keys UP
>> wait 1000
>> keys UP
>> wait 1000
>> keys UP
>> wait 1000
>> keys DOWN
>> wait 1000
>> keys DOWN
>> wait 1000
>> keys DOWN
>> wait 1000
>> keys DOWN
>> keys CTRL,u
>> setDelay 5
# cant copy/paste because visual selection with mouse is required

#
# LOCAL VARIABLES
#
>> wait 500
test=123
variables
typeof test
export test
env | grep test
>> wait 500
test_add=$test+18
typeof test_add
variables
unset test_add
>> wait 500
new="Hello world"
typeof new
export new
env | grep new
>> wait 500
env

/usr/bin/env

#
# BACKQUOTES
#
echo `ls -l`
echo `ls`

#
# HISTORY BUILTIN
#
!!
>> keys CTRL,u
!-0
>> keys CTRL,u
!3
>> keys CTRL,u
!?echo
>> keys CTRL,u

#
# AUTOCOMPLETION
#
>> setDelay 30
pyth%
>> keys TAB
  src/%
>> keys TAB
/%
>> keys TAB
 || ph%
>> keys TAB
>> keys TAB
>> keys TAB
 ~/%
>> keys TAB
>> wait 1500
>> keys CTRL,u
>> keys ENTER
>> setDelay 5