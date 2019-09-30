# Calculator

Homework Weekend One

Research
1. What is the difference in Dalvik and ART
Dalvik is a Just In Time compiler (JIT) while ART is an ahead of time compiler.  This means that Dalvik compiles into machine code on exiction but ART precompiles the program into DEX code and save it in storage during instalation.  This means that while ART will use more storage space it will run faster, use less memory recources, and drain the battery less.
2. What is the DEX Limit?
DEX Limit referances to DEX files.  DEX files contain compiled code for Android devices. DEX limit is equal to 65K (65,536) this is the number of methodes that can be referanced in a DEX file. If you exceed this limit you will get the error (Unable to execute dex: method ID not in [0, 0xffff]: 65536).
3. What are launch modes?
Launch modes are designations to deal with intents in android.  There are 4 common launch modews standard, singleTop, singleInstance, and singleTask
4. What are form factors?
Form factors refer to the size, shape, style, and component layout of a device..  
5. What are Layout Qualifiers
Variable that need to be accounted for when designing a use interfae.  Things like screen width, screen length, resolution, dual app view, ...

coding
Create a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)

<img width="334" alt="Screen Shot 2019-09-30 at 10 56 38 AM" src="https://user-images.githubusercontent.com/55797189/65891822-32879000-e373-11e9-9bb6-4cb6d4a92bc2.png">
