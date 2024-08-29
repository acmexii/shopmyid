
from AbstractEvent import AbstractEvent
import json

class OrderPlaced(AbstractEvent):
    id : int
    userId : str
    productId : str
    productName : str
    qty : int
    amount : int
    orderDt : 
    status : str
    address : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.userId = None
        self.productId = None
        self.productName = None
        self.qty = None
        self.amount = None
        self.orderDt = None
        self.status = None
        self.address = None

