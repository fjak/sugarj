#!/usr/bin/ruby
# seba 01.10.12
# creates sugarj.zip at ARGV[0]/sugarj.jar
# which contains classes compiled from sugarj projects

$this_dir  = File.expand_path(File.dirname(__FILE__))
$script = File.dirname($this_dir)

load "#{$this_dir}/make_util.ruby"
load "#{$this_dir}/extract.ruby"

shell_try "cd '#{$script}' && zip -r sugarj.zip sugarj"
shell_try "cd '#{$script}' && mv sugarj.zip '#{$destination}'"
