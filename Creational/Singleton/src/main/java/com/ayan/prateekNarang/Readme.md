Motivation 
In certain situtations, such as managing a database connection, logging, or configuration settings, you want to ensure that only one instance of a clas is created throughout the application's lifecycle. If multiple instances were created, it could lead to issues like: 
- **Inconsistent state**: If multiple instances represent the same concept, they may hold different data.
- **Resource conflicts**: If multiple instances of a resource-heavy class are created, it can lead to performance degradation.

The Singleton pattern is used when exactly one instance of a class is required to coordinate actions across the system.

When to Use 
- Global resource management(e.g., managing database connections, logging).
- Configuration settings in applications that need to be shared. 


**Singleton Design Code**
- Private Constructor: The constructor is private so that no other class can instantiate AppSettings directly.
- Singleton Access: The getInstance() method is used to access the single instance of the settings. 
- Global Access: Any part of the application can access the settings using AppSettings.getInstance().