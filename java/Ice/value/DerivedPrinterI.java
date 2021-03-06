// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// **********************************************************************

import Demo.*;

class DerivedPrinterI extends DerivedPrinter
{
    @Override
    public void
    printBackwards(Ice.Current current)
    {
        char[] arr = message.toCharArray();
        for(int i = 0; i < arr.length / 2; i++)
        {
            char tmp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(new String(arr));
    }

    @Override
    public void
    printUppercase(Ice.Current current)
    {
        System.out.println(derivedMessage.toUpperCase());
    }
}
