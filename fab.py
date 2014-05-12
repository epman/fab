from Tkinter import *
import PIL
import PIL.Image

import os.path
class Application(Frame):

    def showInfo(self):
        print self.atlasWidth.get(), ", ", self.atlasHeight.get()

    def loadImage(self):
        fname = self.filename.get()
        if (os.path.isfile(fname)):
            self.im = PIL.Image.open( self.filename.get() )
        else:
            self.im = PIL.Image.new("RGB", (self.atlasWidth.get(), self.atlasHeight.get()), "white")
        self.image2 = PhotoImage(self.im)

        self.atlaslabel = Label(self)
        self.atlaslabel.grid(row=0)
        self.atlaslabel.configure(image = self.im)
        self.atlaslabel.image = self.image2
        
        
    def createWidgets(self):
        self.atlaslabel = Label(self)
        #self.atlaslabel.pack(side="top", expand = 1)
        self.atlaslabel.grid(row=0)
        
        self.label1 = Label(self)
        self.label1["text"] = "Width"
        #self.label1.pack({"side": "left"})
        self.label1.grid(row=1, column=0)
        self.entryWidth = Entry(self)
        self.entryWidth["textvariable"] = self.atlasWidth
        #self.entryWidth.pack({"side": "left"})
        self.entryWidth.grid(row=1, column=1)

        self.label2 = Label(self)
        self.label2["text"] = "Height"
        #self.label2.pack(side="top")
        self.label2.grid(row=2, column=0)
        self.entryHeight = Entry(self)
        self.entryHeight["textvariable"] = self.atlasHeight
        #self.entryHeight.pack(side="top")
        self.entryHeight.grid(row=2, column=1)

        self.label3 = Label(self)
        self.label3["text"] = "Rows"
        #self.label3.pack(side="top")
        self.label3.grid(row=3, column=0)
        self.entryRows = Entry(self)
        self.entryRows["textvariable"] = self.atlasRows
        #self.entryRows.pack(side="top")
        self.entryRows.grid(row=3, column=1)

        self.label4 = Label(self)
        self.label4["text"] = "Columns"
        #self.label4.pack(side="top")
        self.label4.grid(row=4, column=0)
        self.entryColumns = Entry(self)
        self.entryColumns["textvariable"] = self.atlasColumns
        #self.entryColumns.pack(side="top")
        self.entryColumns.grid(row=4, column=1)

        self.label5 = Label(self)
        self.label5["text"] = "File"
        #self.label5.pack(side="top")
        self.label5.grid(row=5, column=0)
        self.entryFileName = Entry(self)
        self.entryFileName["textvariable"] = self.filename
        #self.entryFileName.pack(side="top")
        self.entryFileName.grid(row=5, column=1)

        self.QUIT = Button(self)
        self.QUIT["text"] = "QUIT"
        self.QUIT["fg"]   = "red"
        self.QUIT["command"] =  self.quit
        #self.QUIT.pack({"side": "left"})
        self.QUIT.grid(row=6, column=0)

        self.btnGenerate = Button(self)
        self.btnGenerate["text"] = "Generate",
        self.btnGenerate["command"] = self.showInfo
        #self.btnGenerate.pack({"side": "left"})
        self.btnGenerate.grid(row=6, column=1)
        
        self.loadImage()

    def __init__(self, master=None):
        self.atlasWidth  = IntVar()
        self.atlasWidth.set( 512 )
        self.atlasHeight  = IntVar()
        self.atlasHeight.set( 512 )
        self.atlasColumns  = IntVar()
        self.atlasColumns.set( 8 )
        self.atlasRows  = IntVar()
        self.atlasRows.set( 8 )
        self.filename  = StringVar()
        self.filename.set( "font.png" )
        Frame.__init__(self, master)
        self.pack()
        self.createWidgets()

root = Tk()
app = Application(master=root)
app.mainloop()
root.destroy()
