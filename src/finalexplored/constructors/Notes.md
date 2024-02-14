# Constructors Review - advanced topics

## The instance initializer block

An instance initializer is a block of code declared directly in a class
body.

This code gets executed when an instance of the class is created.

Instance initializers are executed, before any code in class constructors
is executed.

You can have multiple initializer blocks.

They will be executed in the order they are declared.

## Static initializers

A static initializer is called the first time a class is referenced
or constructed.

A class can have any number of static initialization blocks.

They can be declared anywhere in the class body.

They're called in the order they appear in the source code.

You might use this to set up some environment data or log information,
that's related to the class before it can be used.

Remember, this will get executed only during the class's construction
and not each instance's construction.

## Record Constructors

The Canonical, or Long constructor is the implicitly generated constructor.
You can explicitly declare your own, which means the implicit one won't
get generated. If you do declare your own, you must make sure all fields
get assigned a value.

The Custom constructor is just an overload constructor. It must explicitly
call the canonical constructor as it's first statement.

The Compact, or Short constructor is a special kind of constructor, used
only on records. It's a succinct way of explicitly declaring a canonical
constructor.

### The Compact Constructor

You can't have both a compact constructor and an explicit canonical
constructor.

This constructor is declared with no parentheses, so no arguments.

It has access to all the arguments of the canonical constructor. Don't
confuse the arguments with the instance fields!

You can't do assignments to the instance fields in this constructor.

The implicit canonical constructor's assignments occur after the execution
of this code.

## Java Class File Disassembler

This is **javap**.

It lists class members, by default just public and protected members in
the class file.

This helps us 'see' implicit code in the compiled class file.