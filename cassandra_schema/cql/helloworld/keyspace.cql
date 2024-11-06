CREATE KEYSPACE helloworld WITH replication = {
    'class': 'SimpleStrategy',
    'replication_factor': 3
    };