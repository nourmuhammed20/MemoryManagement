Memory Management Simulator
===========================

   

This repository contains the source code for a memory allocation simulator that allocates variable-sized partitions of the memory to a given sequence of process requests. It applies different allocation policies such as First-Fit, Best-Fit, and Worst-Fit.

Table of Contents
-----------------

*   [Assignment Details](#assignment-details)
*   [Usage](#usage)
*   [Sample Input](#sample-input)
*   [Contributing](#contributing)
*   [License](#license)

Assignment Details
------------------

*   Faculty: Faculty of Computers and Information
*   University: Cairo University
*   Course: Operating System 1
*   Assignment: Memory Management (Assignment 3)
*   Marks: 6



Usage
-----

To run the memory allocation simulator, follow these steps:

1.  Clone the repository:
    
    bash
    
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    ```
    
2.  Compile the Java source code:
    
    bash
    
    ```bash
    javac MemoryAllocator.java
    ```
    
3.  Run the simulator:
    
    bash
    
    ```bash
    java MemoryAllocator
    ```
    
4.  Follow the on-screen instructions and provide the required input.
    

Sample Input
------------

The input for the simulator should be provided in the following format:

*   Number of partitions
*   Partition name and size
*   Number of process requests
*   Process name and size
*   Selected policy by the user

Sample input:


```mathematica
Enter number of partitions:
6
Enter partition name and size:
Partition0 90
Enter partition name and size:
Partition1 20
Enter partition name and size:
Partition2 5
Enter partition name and size:
Partition3 30
Enter partition name and size:
Partition4 120
Enter partition name and size:
Partition5 80
Enter number of process requests:
4
Enter process name and size:
Process1 15
Enter process name and size:
Process2 90
Enter process name and size:
Process3 30
Enter process name and size:
Process4 100
Select the policy you want to apply:
1. First fit
2. Worst fit
3. Best fit
Select policy:
1
```

Contributing
------------

Contributions are welcome! If you find any issues or would like to contribute enhancements to this project, feel free to open a new issue or submit a pull request.

License
-------

This project is licensed under the [MIT License](LICENSE).
