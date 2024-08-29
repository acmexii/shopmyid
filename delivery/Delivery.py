from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from DeliveryReturned import DeliveryReturned
from DeliveryCompleted import DeliveryCompleted

Base = declarative_base()

class Delivery(Base):
    __tablename__ = 'Delivery_table'
    id = Column(Integer, primary_key=True)
    orderId = Column(String(50))
    productId = Column(String(50))
    productName = Column(String(50))
    qty = Column(Integer)
    amount = Column(Integer)
    deliveryDt = Column()
    status = Column(String(50))

    def __init__(self):
        self.id = None
        self.orderId = None
        self.productId = None
        self.productName = None
        self.qty = None
        self.amount = None
        self.deliveryDt = None
        self.status = None

@event.listens_for(Delivery, 'after_insert')
def PostPersist(mapper, connection, target):
    event = DeliveryReturned()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    
@event.listens_for(Delivery, 'after_update')
def PostUpdate(mapper, connection, target):
    event = DeliveryCompleted()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

