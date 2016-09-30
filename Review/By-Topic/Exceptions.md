# Exceptions

[cplusplus.com reference](http://www.cplusplus.com/reference/exception/exception/)

Some types of exceptions:

* exception
  * logic_error
    * invalid_argument - Defines a type of object to be thrown as exception. It reports errors that arise because an argument value has not been accepted.
    * length_error - Defines a type of object to be thrown as exception. It reports errors that are consequence of attempt to exceed implementation defined length limits for some object.
    * out_of_range - Defines a type of object to be thrown as exception. It reports errors that are consequence of attempt to access elements out of defined range.
  * runtime_error
    * overflow_error - Defines a type of object to be thrown as exception. It can be used to report arithmetic overflow errors (that is, situations where a result of a computation is too large for the destination type) 
    * range_error - Defines a type of object to be thrown as exception. It can be used to report range errors (that is, situations where a result of a computation cannot be represented by the destination type) 
    * underflow_error - Defines a type of object to be thrown as exception. It may be used to report arithmetic underflow errors (that is, situations where the result of a computation is a subnormal floating-point value) 
