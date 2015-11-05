# Random Data Generator

## Description
This project uses a number of different generators to output random Byte array data.

It will continually output Byte arrays of size n.

## Package
mvn package

## Run
mvn scala:run -DmainClass=ie.eoin.sample.devrandom.App -DaddArgs="javasecure|10"
OR
java -jar ./target/dev-random-1.0-SNAPSHOT-jar-with-dependencies.jar javasecure 10

## Flags
java -> Java's default PRNG. This is a linear congruential pseudorandom number generator, as defined by D. H. Lehmer and described by Donald E. Knuth in The Art of Computer Programming, Volume 3: Seminumerical Algorithms, section 3.2.1
javasecure -> The SHA1PRNG provided by the SUN CSP.
simple -> The PRNG I wrote, very simple


## Test

### Install ent
http://www.fourmilab.ch/random/
```
Brew install ent
```

### Run tests

#### Java
java -jar ./target/dev-random-1.0-SNAPSHOT-jar-with-dependencies.jar java 100 | od -An -N1000 | ent 
```
Entropy = 2.684033 bits per byte.

Optimum compression would reduce the size
of this 4663 byte file by 66 percent.

Chi square distribution for 4663 samples is 239781.86, and randomly
would exceed this value less than 0.01 percent of the times.

Arithmetic mean value of data bytes is 43.5580 (127.5 = random).
Monte Carlo value for Pi is 4.000000000 (error 27.32 percent).
Serial correlation coefficient is 0.496299 (totally uncorrelated = 0.0).
```

#### Java Secure
java -jar ./target/dev-random-1.0-SNAPSHOT-jar-with-dependencies.jar javasecure 100 | od -An -N1000 | ent 
```
Entropy = 2.685902 bits per byte.

Optimum compression would reduce the size
of this 4663 byte file by 66 percent.

Chi square distribution for 4663 samples is 239541.07, and randomly
would exceed this value less than 0.01 percent of the times.

Arithmetic mean value of data bytes is 43.5623 (127.5 = random).
Monte Carlo value for Pi is 4.000000000 (error 27.32 percent).
Serial correlation coefficient is 0.502681 (totally uncorrelated = 0.0).
```

#### Simple
java -jar ./target/dev-random-1.0-SNAPSHOT-jar-with-dependencies.jar simple 100 | od -An -N1000 | ent
```
Entropy = 2.683670 bits per byte.

Optimum compression would reduce the size
of this 4663 byte file by 66 percent.

Chi square distribution for 4663 samples is 240474.60, and randomly
would exceed this value less than 0.01 percent of the times.

Arithmetic mean value of data bytes is 43.5447 (127.5 = random).
Monte Carlo value for Pi is 4.000000000 (error 27.32 percent).
Serial correlation coefficient is 0.493548 (totally uncorrelated = 0.0).
```
