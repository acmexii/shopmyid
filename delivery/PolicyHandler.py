import util
import DeliveryDB
from Delivery import Delivery
deliveryrepository = DeliveryDB.repository


from OrderPlaced import OrderPlaced

def wheneverOrderPlaced_StartDelivery(data):
    event = OrderPlaced()
    event = util.AutoBinding(data, event)
    
    delivery = Delivery()
    deliveryrepository.save(delivery)
    
from OrderCancelled import OrderCancelled

def wheneverOrderCancelled_CancelDelivery(data):
    event = OrderCancelled()
    event = util.AutoBinding(data, event)
    
    delivery = Delivery()
    deliveryrepository.save(delivery)
    

