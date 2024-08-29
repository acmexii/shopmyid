from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class DeliveryCompleted(AbstractEvent):
    id : int
    orderId : str
    status : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.orderId = None
        self.status = None

