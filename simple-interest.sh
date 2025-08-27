#!/bin/bash
# This script calculates simple interest

# Formula: SI = (P * T * R) / 100

echo "Enter Principal:"
read p
echo "Enter Rate of Interest:"
read r
echo "Enter Time (in years):"
read t

si=$(( (p * r * t) / 100 ))
echo "The Simple Interest is: $si"
