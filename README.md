# spring-samples
my spring-samples from zero to spring expert

# spring_sample
Spring_sample is pretty basic Java project - 
  - Customer.class as model, 
  - HibernateCustomerRepositoryImpl.class - which actually doesn't connect to any database but creates a hardcoded customer object
  - CustomerServiceImpl.class - this creates a hard-coded link to above repo class and emits the list of customers back to client.
  - Application.class - this is Main method.
  
  
# spring_sample_xml
Above project stiched together using Spring.
All dependencies are externalized in an applicationContext.xml file.
