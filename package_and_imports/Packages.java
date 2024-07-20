package oracle_certification_preparation.package_and_imports;

public class Packages {

    /**
     * import java.io.*;
     * package com.intertech.transport;
     * public class Truck {
     * }
     *
     * Will this code compile? R = No, The package statement should have been listed at the top of the file.
     */

    /**
     * package com.intertech.*;
     * import java.util.*;
     * public class Person {
     * }
     *
     * Will this code compile? = The order of package and import is correct, but a package statement cannot use *.
     */

    /**
     * import java.util.*;
     * public class Person {
     * }
     *
     * Will this code compile (assuming the Person class is in the default package). = Yes, You don't list a package
     * statement if the class is in the default package
     */


}
