from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class DeliveryReturned(AbstractEvent):
    id : int
    orderId : str
    productId : str
    productName : str
    qty : int
    amount : int
    deliveryDt : 
    status : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.orderId = None
        self.productId = None
        self.productName = None
        self.qty = None
        self.amount = None
        self.deliveryDt = None
        self.status = None

