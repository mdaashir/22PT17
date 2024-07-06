# import pywhatkit as py
import webbrowser as web
from urllib.parse import quote
for i in range(int(input('Enter the times: '))):
    #py.sendwhatmsg_instantly(f'+919791353394','hello')
    web.open(f"https://web.whatsapp.com/send?phone='+919791353394 &text={quote('hello')}")
